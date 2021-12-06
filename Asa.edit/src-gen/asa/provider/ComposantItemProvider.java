/**
 */
package asa.provider;

import asa.AsaFactory;
import asa.AsaPackage;
import asa.Composant;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link asa.Composant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComposantItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Composant_Name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Composant_Name_feature",
								"_UI_Composant_type"),
						AsaPackage.Literals.COMPOSANT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AsaPackage.Literals.COMPOSANT__CONSTRAINT);
			childrenFeatures.add(AsaPackage.Literals.COMPOSANT__PROPERTIES);
			childrenFeatures.add(AsaPackage.Literals.COMPOSANT__SERVICEFOURNIS);
			childrenFeatures.add(AsaPackage.Literals.COMPOSANT__SERVICEREQUIS);
			childrenFeatures.add(AsaPackage.Literals.COMPOSANT__PORTREQUISCOMPOSANT);
			childrenFeatures.add(AsaPackage.Literals.COMPOSANT__PORTFOURNISCOMPOSANT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Composant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Composant"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Composant) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Composant_type")
				: getString("_UI_Composant_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Composant.class)) {
		case AsaPackage.COMPOSANT__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AsaPackage.COMPOSANT__CONSTRAINT:
		case AsaPackage.COMPOSANT__PROPERTIES:
		case AsaPackage.COMPOSANT__SERVICEFOURNIS:
		case AsaPackage.COMPOSANT__SERVICEREQUIS:
		case AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT:
		case AsaPackage.COMPOSANT__PORTFOURNISCOMPOSANT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(AsaPackage.Literals.COMPOSANT__CONSTRAINT,
				AsaFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(AsaPackage.Literals.COMPOSANT__PROPERTIES,
				AsaFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add(createChildParameter(AsaPackage.Literals.COMPOSANT__SERVICEFOURNIS,
				AsaFactory.eINSTANCE.createServiceFournis()));

		newChildDescriptors.add(createChildParameter(AsaPackage.Literals.COMPOSANT__SERVICEREQUIS,
				AsaFactory.eINSTANCE.createServiceRequis()));

		newChildDescriptors.add(createChildParameter(AsaPackage.Literals.COMPOSANT__PORTREQUISCOMPOSANT,
				AsaFactory.eINSTANCE.createPortRequisComposant()));

		newChildDescriptors.add(createChildParameter(AsaPackage.Literals.COMPOSANT__PORTFOURNISCOMPOSANT,
				AsaFactory.eINSTANCE.createPortFournisComposant()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AsaEditPlugin.INSTANCE;
	}

}
