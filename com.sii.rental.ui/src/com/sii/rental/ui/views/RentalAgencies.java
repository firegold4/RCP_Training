
package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.ui.RentalProvider;

public class RentalAgencies {

	@PostConstruct
	public void createContent(Composite parent, RentalAgency agency) {
		TreeViewer tv = new TreeViewer(parent);
		RentalProvider provider = new RentalProvider();
		tv.setContentProvider(provider);
		tv.setLabelProvider(provider);
	
		Collection<RentalAgency> agencies = new ArrayList<>();
		agencies.add(agency);
		tv.setInput(agencies);
	}
}