
package com.sii.rental.ui.views;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Customer;
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

		GridData infoGridData = new GridData();
		infoGridData.grabExcessHorizontalSpace = true;
		infoGridData.horizontalSpan = 2;
		infoGridData.horizontalAlignment = SWT.FILL;

		rentedObjectLabel = new Label(infoGroup, SWT.NONE);
		rentedObjectLabel.setLayoutData(infoGridData);

		customerNameLabel = new Label(infoGroup, SWT.NONE);
		customerNameLabel.setLayoutData(infoGridData);

		Group datesGroup = new Group(parent, SWT.NONE);
		datesGroup.setLayout(GridLayoutFactory.fillDefaults() //
				.numColumns(1) //
				.equalWidth(false) //
				.create());
		datesGroup.setLayoutData(GridDataFactory.fillDefaults() //
				.align(SWT.FILL, SWT.CENTER) //
				.grab(true, false) //
				.span(1, 1) //
				.create());
		datesGroup.setText("Dates de location");

		GridData dateGridData = GridDataFactory.fillDefaults() //
				.align(SWT.FILL, SWT.CENTER) //
				.grab(true, false) //
				.span(1, 1) //
				.create();

		fromDateLabel = new Label(datesGroup, SWT.NONE);
		fromDateLabel.setLayoutData(dateGridData);

		toDateLabel = new Label(datesGroup, SWT.NONE);
		toDateLabel.setLayoutData(dateGridData);

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

	@Inject
	@Optional
	public void selectCustomers(@Named(IServiceConstants.ACTIVE_SELECTION) Object[] selection) {
		if (selection != null) {
			customerNameLabel.setText("Loué à : ");
			for (Object obj : selection) {
				if (obj instanceof Customer) {
					setCustomer((Customer) obj);
				}
			}
		}
	}

	private void setCustomer(Customer customer) {
		if (customer != null) {
			customerNameLabel.setText(customerNameLabel.getText() + customer.getFirstName() + " " + customer.getLastName() + ", ");
			rentedObjectLabel.setText("");
			fromDateLabel.setText("Du : ");
			toDateLabel.setText("Au : ");
		}
	}
}