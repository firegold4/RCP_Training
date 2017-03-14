
package com.sii.rental.ui.views;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPart {

	private Label rentedObjectLabel, customerNameLabel, fromDateLabel, toDateLabel;

	@Inject
	public RentalPart(Composite parent, RentalAgency agency) {
		parent.setLayout(GridLayoutFactory.fillDefaults() //
				.numColumns(1) //
				.equalWidth(false) //
				.create());
		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		infoGroup.setText("Informations");
		infoGroup.setLayout(GridLayoutFactory.fillDefaults() //
				.numColumns(2) //
				.equalWidth(false) //
				.create());

		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;

		rentedObjectLabel = new Label(infoGroup, SWT.NONE);
		rentedObjectLabel.setLayoutData(gd);

		GridData gd2 = new GridData();
		gd2.grabExcessHorizontalSpace = true;
		gd2.horizontalSpan = 2;
		gd2.horizontalAlignment = SWT.FILL;
		customerNameLabel = new Label(infoGroup, SWT.NONE);
		customerNameLabel.setLayoutData(gd2);

		Group datesGroup = new Group(parent, SWT.NONE);
		datesGroup.setLayout(new GridLayout(1, false));
		datesGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		datesGroup.setText("Dates de location");

		fromDateLabel = new Label(datesGroup, SWT.NONE);
		fromDateLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		toDateLabel = new Label(datesGroup, SWT.NONE);
		toDateLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		setRental(agency.getRentals().get(0));
	}

	public void setRental(Rental r) {
		if (r != null) {
			rentedObjectLabel.setText(r.getRentedObject().getName());
			customerNameLabel.setText("Loué à : " + r.getCustomer().getFirstName() + " " + r.getCustomer().getLastName());
			fromDateLabel.setText("Du : " + r.getStartDate().toString());
			toDateLabel.setText("Au : " + r.getEndDate().toString());
		}
	}

	@Focus
	public void onFocus() {
	}

	@Inject
	@Optional
	public void receiveSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Rental rental) {
		setRental(rental);
	}

	//	@Inject
	//	@Optional
	//	public void selectCustomers(@Named(IServiceConstants.ACTIVE_SELECTION) Object[] selection) {
	//		for (Object obj : selection) {
	//			if (obj instanceof Customer) {
	//				setCustomer((Customer) obj);
	//			}
	//		}
	//	}
}