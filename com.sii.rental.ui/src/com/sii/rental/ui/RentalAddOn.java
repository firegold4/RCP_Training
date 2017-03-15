package com.sii.rental.ui;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.core.RentalCoreActivator;

public class RentalAddOn implements RentalUIConstants {

	@PostConstruct
	public void initContext(IEclipseContext context) {
		context.set(RentalAgency.class, RentalCoreActivator.getAgency());
		context.set(RENTAL_UI_IMG_REGISTRY, getLocalImageRegistry());
		context.set(IPreferenceStore.class, new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui"));
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
}
