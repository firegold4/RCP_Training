
package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.ui.RentalProvider;

public class RentalAgencies {

	@Inject
	private ESelectionService selectionService;
	
	@PostConstruct
	public void createContent(Composite parent, RentalAgency agency, IEclipseContext context) {
		TreeViewer tv = new TreeViewer(parent);
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
	}
}