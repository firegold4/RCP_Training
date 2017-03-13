
package com.sii.rental.ui.views;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.sii.rental.core.RentalCoreActivator;

public class RentalPart {

	private Label rentedObjectLabel, customerNameLabel;
	
	@PostConstruct
	public void createContent(Composite parent) {
		parent.setLayout(GridLayoutFactory.fillDefaults() //
				.numColumns(1) //
				.equalWidth(false) //
				.create());
		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setText("Informations");
		infoGroup.setLayout(GridLayoutFactory.fillDefaults() //
				.numColumns(2) //
				.equalWidth(false) //
				.create());
		
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;

		rentedObjectLabel = new Label(infoGroup, SWT.BORDER);
		rentedObjectLabel.setLayoutData(gd);
		
		customerNameLabel = new Label(infoGroup, SWT.BORDER);
		customerNameLabel.setLayoutData(gd);
		
		setRental(RentalCoreActivator.getAgency().getRentals().get(0));
	}
	
	public void setRental(Rental r) {
		rentedObjectLabel.setText(r.getRentedObject().getName());
		customerNameLabel.setText("Loué à : " + r.getCustomer().getFirstName() + " " + r.getCustomer().getLastName());
	}

	@Focus
	public void onFocus() {
	}

}