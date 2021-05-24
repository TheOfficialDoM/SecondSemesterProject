package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import control.ItemCtr;
import model.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateItemDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JPanel contentPanel = new JPanel();
	
	private JTextField textFieldName;
	private JTextField textFieldPrice;
	private JTextField textFieldBarcode;
	private JTextField textFieldSupplier;
	private JTextField textFieldDescription;
	private JTextField textFieldStock;
	
	private Item item;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UpdateItemDialog dialog = new UpdateItemDialog(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UpdateItemDialog(String barcode) {
		item = ItemContainer.getInstance().getItem(barcode);
		
		setTitle("Update item dialog");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("Name:");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textFieldName = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 2;
			gbc_textField.gridy = 1;
			contentPanel.add(textFieldName, gbc_textField);
			textFieldName.setColumns(10);
			textFieldName.setText(item.getName());
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Price:");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 2;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textFieldPrice = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 0);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 2;
			gbc_textField_1.gridy = 2;
			contentPanel.add(textFieldPrice, gbc_textField_1);
			textFieldPrice.setColumns(10);
			textFieldPrice.setText(String.valueOf(item.getPrice()));
			
		}
		{
			JLabel lblNewLabel_2 = new JLabel("New barcode:");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_2.gridx = 1;
			gbc_lblNewLabel_2.gridy = 3;
			contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		}
		{
			textFieldBarcode = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.insets = new Insets(0, 0, 5, 0);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 2;
			gbc_textField_2.gridy = 3;
			contentPanel.add(textFieldBarcode, gbc_textField_2);
			textFieldBarcode.setColumns(10);
			textFieldBarcode.setText(barcode);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Supplier:");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_3.gridx = 1;
			gbc_lblNewLabel_3.gridy = 4;
			contentPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		}
		{
			textFieldSupplier = new JTextField();
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.insets = new Insets(0, 0, 5, 0);
			gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_3.gridx = 2;
			gbc_textField_3.gridy = 4;
			contentPanel.add(textFieldSupplier, gbc_textField_3);
			textFieldSupplier.setColumns(10);
			textFieldSupplier.setText(item.getSupplier());
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Description:");
			GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
			gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_4.gridx = 1;
			gbc_lblNewLabel_4.gridy = 5;
			contentPanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		}
		{
			textFieldDescription = new JTextField();
			GridBagConstraints gbc_textField_4 = new GridBagConstraints();
			gbc_textField_4.insets = new Insets(0, 0, 5, 0);
			gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_4.gridx = 2;
			gbc_textField_4.gridy = 5;
			contentPanel.add(textFieldDescription, gbc_textField_4);
			textFieldDescription.setColumns(10);
			textFieldDescription.setText(item.getDescription());
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Stock:");
			GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
			gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_5.gridx = 1;
			gbc_lblNewLabel_5.gridy = 6;
			contentPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		}
		{
			textFieldStock = new JTextField();
			GridBagConstraints gbc_textField_5 = new GridBagConstraints();
			gbc_textField_5.insets = new Insets(0, 0, 5, 0);
			gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_5.gridx = 2;
			gbc_textField_5.gridy = 6;
			contentPanel.add(textFieldStock, gbc_textField_5);
			textFieldStock.setColumns(10);
			textFieldStock.setText(String.valueOf(item.getStock()));
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Minimum stock: "+item.getMinStock()+" | Maximum stock: "+item.getMaxStock());
			GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
			gbc_lblNewLabel_6.gridx = 2;
			gbc_lblNewLabel_6.gridy = 7;
			contentPanel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Update");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						updateItem(barcode);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancel();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		
	}
	
	private void updateItem(String barcode) {
		String name = textFieldName.getText();
		String stringPrice = textFieldPrice.getText();
		String newBarcode = textFieldBarcode.getText();
		String supplier = textFieldSupplier.getText();
		String description = textFieldDescription.getText();
		String stringStock = textFieldStock.getText();
		
		boolean priceAccepted = false;
		boolean stockAccepted = false;
		
		ItemCtr itemCtr = new ItemCtr();
		
		try {
			Double priceDouble = Double.valueOf(stringPrice);
			if(priceDouble > 0) {
				priceAccepted = true;
			} else {
				priceAccepted = false;
				JOptionPane.showMessageDialog(this, "The price cannot be a negative number or zero!", "Warning", JOptionPane.WARNING_MESSAGE);
			}
			
			int stockInt = Integer.valueOf(stringStock);
			if(stockInt >= 0 && stockInt <= item.getMaxStock()) {
				stockAccepted = true;
			} else {
				stockAccepted = false;
				JOptionPane.showMessageDialog(this, "Invalid stock amount!", "Warning", JOptionPane.WARNING_MESSAGE);
			}
			
			if(priceAccepted && stockAccepted) {
				if(newBarcode.equals(barcode)) {
					updateItem(barcode, name, priceDouble, newBarcode, supplier, description, stockInt);
					return;
				}
				if(itemCtr.getItem(newBarcode) == null) {
					updateItem(barcode, name, priceDouble, newBarcode, supplier, description, stockInt);
				} else {
					JOptionPane.showMessageDialog(this, "This barcode already exists in the system.", "Warning", JOptionPane.WARNING_MESSAGE);
				}
			}
			
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "Incorrect information in one of the fields", "Warning", JOptionPane.WARNING_MESSAGE);
		} finally {
			// TODO check which is the best method to call
			//this.dispose();
		}
	}

	private void cancel() {
		textFieldName.setText(null);;
		textFieldPrice.setText(null);;
		textFieldBarcode.setText(null);;
		textFieldSupplier.setText(null);;
		textFieldDescription.setText(null);;
		textFieldStock.setText(null);;
	}
	
	private void updateItem(String barcode, String name, double priceDouble, String newBarcode, String supplier, String description, int stock) {
		ItemCtr itemCtr = new ItemCtr();
		itemCtr.updateItem(barcode, name, priceDouble, newBarcode, supplier, description, stock);
		JOptionPane.showMessageDialog(this, "You successfully updated an item.", "Success", JOptionPane.INFORMATION_MESSAGE);
		this.dispose();
	}
}
