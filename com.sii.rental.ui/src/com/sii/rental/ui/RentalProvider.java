package com.sii.rental.ui;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class RentalProvider extends LabelProvider implements ITreeContentProvider, IColorProvider, RentalUIConstants {

	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;
	@Inject
	private IPreferenceStore prefStore;
	
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
		} else if (element instanceof Node) {
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

	@Override
	public Color getForeground(Object element) {
		if (element instanceof Node) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GREEN);
		} else if (element instanceof RentalAgency) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		} else if (element instanceof Customer) {
			return getAColor(prefStore.getString(PREF_CUSTOMER_COLOR));
		} else if (element instanceof Rental) {
			return getAColor(prefStore.getString(PREF_RENTAL_COLOR));
		} else if (element instanceof RentalObject) {
			return getAColor(prefStore.getString(PREF_RENTAL_OBJECT_COLOR));
		}
		return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED);
	}

	@Override
	public Color getBackground(Object element) {
		return null;
	}
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof RentalAgency) {
			return registry.get(IMG_AGENCY);
		} else if (element instanceof Node) {
			if (((Node)element).getName() == Node.CUSTOMERS) {
				return registry.get(IMG_CUSTOMER);
			} else if (((Node)element).getName() == Node.ALOUER) {
				return registry.get(IMG_RENTAL);
			} else if (((Node)element).getName() == Node.LOCATIONS) {
				return registry.get(IMG_RENTAL_OBJECT);
			}
		}
		return super.getImage(element);
	}

	private Color getAColor(String rgbKey) {
		ColorRegistry colorRegestry = JFaceResources.getColorRegistry();
		Color col = colorRegestry.get(rgbKey);
		if (col == null) {
			colorRegestry.put(rgbKey, StringConverter.asRGB(rgbKey));
			col = colorRegestry.get(rgbKey);
		}
		return col;
	}
	
	
	class Node {
		private static final String LOCATIONS = "Locations";
		private static final String CUSTOMERS = "Customers";
		private static final String ALOUER = "Objets � louer";
		private String name;
		
		public String getName() {
			return name;
		}

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

		private RentalProvider getOuterType() {
			return RentalProvider.this;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((agency == null) ? 0 : agency.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (agency == null) {
				if (other.agency != null)
					return false;
			} else if (!agency.equals(other.agency))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
	}
}
