
package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.ui.RentalProvider;
import com.sii.rental.ui.RentalUIConstants;

@SuppressWarnings("restriction")
public class RentalAgencies implements RentalUIConstants{

	private TreeViewer tv;
	@Inject
	private ESelectionService selectionService;
	
	@PostConstruct
	public void createContent(Composite parent, RentalAgency agency, IEclipseContext context, EMenuService menuService) {
		tv = new TreeViewer(parent);
		// RentalProvider provider = new RentalProvider();
		// A partir du moment où on essaye d'injecter un attribut dans RentalProvider la classe ne peut plus être instanciée avec un new
		
		RentalProvider provider = ContextInjectionFactory.make(RentalProvider.class, context);
		tv.setContentProvider(provider);
		tv.setLabelProvider(provider);
	
		Collection<RentalAgency> agencies = new ArrayList<>();
		agencies.add(agency);
		tv.setInput(agencies);
		tv.expandAll();
		
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection)event.getSelection();
				selectionService.setSelection(sel.size() == 1 ? sel.getFirstElement() : sel.toArray());
			}
		});
		menuService.registerContextMenu(tv.getControl(), "com.sii.rental.eap.popupmenu.hellopopup");
	}
	
	@Inject
	public void refreshTree(@Preference(value = PREF_CUSTOMER_COLOR) String customerColor,
			@Preference(value = PREF_RENTAL_COLOR) String rentalColor,
			@Preference(value = PREF_RENTAL_OBJECT_COLOR) String rentalObjectColor,
			@Preference(value = PREF_PALETTE) String ppal) {
		if (tv != null && !tv.getTree().isDisposed()) {
			tv.refresh();
		}
	}
}