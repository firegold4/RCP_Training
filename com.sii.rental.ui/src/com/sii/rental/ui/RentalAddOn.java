package com.sii.rental.ui;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.core.RentalCoreActivator;

public class RentalAddOn implements RentalUIConstants {

	public static final String PALETTE_MANAGER = "palette manager";
	private Map<String, PaletteDescriptor> paletteManager = new HashMap<>();
	
	@PostConstruct
	void initContext(IEclipseContext context) {
		context.set(RentalAgency.class, RentalCoreActivator.getAgency());
		context.set(RENTAL_UI_IMG_REGISTRY, getLocalImageRegistry());
		context.set(IPreferenceStore.class, new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui"));
		context.set(PALETTE_MANAGER, paletteManager);
	}
	
	public ImageRegistry getLocalImageRegistry() {
		Bundle bundle = FrameworkUtil.getBundle(getClass());
		ImageRegistry reg = new ImageRegistry();
		
		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(bundle.getEntry(IMG_CUSTOMER)));
		reg.put(IMG_RENTAL, ImageDescriptor.createFromURL(bundle.getEntry(IMG_RENTAL)));
		reg.put(IMG_RENTAL_OBJECT, ImageDescriptor.createFromURL(bundle.getEntry(IMG_RENTAL_OBJECT)));
		reg.put(IMG_AGENCY, ImageDescriptor.createFromURL(bundle.getEntry(IMG_AGENCY)));
		return reg;
	}
	
	@Inject
	@Optional
	public void reatOnCopyEvent(@UIEventTopic("copy/customer") Customer customer) {
		System.out.println("Copie du client " + customer.getDisplayName());
	}
	
	@Inject
	public void getExtensionsQuickAccess(IExtensionRegistry registry) {
		for (IConfigurationElement element : registry.getConfigurationElementsFor("org.eclipse.e4.workbench.model")) {
			if (element.getName().equals("fragment")) {
				System.out.println(element.getNamespaceIdentifier() + " : " + element.getAttribute("uri"));
			} else if (element.getName().equals("processor")) {
				System.out.println(element.getNamespaceIdentifier() + " : " + element.getAttribute("class"));
			}
		}
	}
	
	@Inject
	public void readPaletteManager(IEclipseContext context) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		for (IConfigurationElement element : registry.getConfigurationElementsFor("com.sii.rental.ui.palette")) {
			PaletteDescriptor palette = new PaletteDescriptor();
			palette.setId(element.getAttribute("id"));
			palette.setName(element.getAttribute("name"));
			try {
				IColorProvider provider = (IColorProvider)element.createExecutableExtension("paletteClass");
				ContextInjectionFactory.inject(provider, context);
				palette.setProvider(provider);
				paletteManager.put(palette.getId(), palette);
				System.out.println("Palette " + palette.getName() + " trouvée");

			} catch (Exception e) {
				System.out.println("Impossible d'instancier la palette " + element.getAttribute("name"));
				e.printStackTrace();
			}
		}
	}
}
