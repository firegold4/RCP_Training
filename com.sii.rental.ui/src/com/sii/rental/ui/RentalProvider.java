package com.sii.rental.ui;

import java.util.Collection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class RentalProvider extends LabelProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection<?>) {
			return ((Collection<?>) inputElement).toArray();
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof RentalAgency) {
			return new Object[] {
					new Node(Node.CUSTOMERS, (RentalAgency) parentElement), 
					new Node(Node.LOCATIONS, (RentalAgency) parentElement), 
					new Node(Node.ALOUER, (RentalAgency) parentElement)
			};
		} else if (parentElement instanceof Node) {
			return ((Node) parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof RentalAgency) {
			return true;
		}
		if (element instanceof Node) {
			return ((Node) element).getChildren() != null;
		}
		return false;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof RentalAgency) {
			return ((RentalAgency) element).getName();
		} else if (element instanceof Customer) {
			return ((Customer) element).getDisplayName();
		} else if (element instanceof RentalObject) {
			return ((RentalObject) element).getName();
		} else {	
			return super.getText(element);
		}
	}

	class Node {
		private static final String LOCATIONS = "Locations";
		private static final String CUSTOMERS = "Customers";
		private static final String ALOUER = "Objets à louer";
		private String name;
		RentalAgency agency;

		public Node(String name, RentalAgency agency) {
			super();
			this.name = name;
			this.agency = agency;
		}

		public Object[] getChildren() {
			if (name == CUSTOMERS) {
				return agency.getCustomers().toArray();
			} else if (name == LOCATIONS) {
				return agency.getRentals().toArray();
			} else if (name == ALOUER) {
				return agency.getObjectsToRent().toArray();
			}
			return null;
		}

		@Override
		public String toString() {
			return name;
		}
	}
}
