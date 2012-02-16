package org.convey.tutorial.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.convey.tutorial.dto.Sales;
import org.springframework.stereotype.Component;

@Component
public class SalesDAO {

	/**
	 * Our dummy datasource. Retrieves a collection of data that is wrapped by a JRBeanCollectionDataSource.
	 *  
	 * @return a JRBeanCollectionDataSource collection
	 */
	public  JRDataSource getDataSource() {
		// Create an array list of Sales 
		List<Sales> items = new ArrayList<Sales>();
		
		// We'll add three Sales items
		// You can populate data from a custom JDBC or DAO layer
		// For this demo, we'll create an in-memory list of items
		
		// Create first item
		Sales item1 = new Sales();
		item1.setId(1001L);
		item1.setName("Pencil");
		item1.setDescription("This is used for sketching drawings");
		item1.setPrice(10.50);
		item1.setManufacturer("Company A");
		item1.setLocation("North Pole");
		
		// Create second item
		Sales item2 = new Sales();
		item2.setId(1002L);
		item2.setName("Pen");
		item2.setDescription("This is used for signing autographs");
		item2.setPrice(15.00);
		item2.setManufacturer("Company B");
		item2.setLocation("South Pole");
		
		// Create third item
		Sales item3 = new Sales();
		item3.setId(1003L);
		item3.setName("Bag");
		item3.setDescription("This is used for storing other items");
		item3.setPrice(50.00);
		item3.setManufacturer("Company C");
		item3.setLocation("East Pole");
		
		// Add to list
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		// Wrap the collection in a JRBeanCollectionDataSource
		// This is one of the collections that Jasper understands
		JRDataSource ds = new JRBeanCollectionDataSource(items);

		// Return the wrapped collection
		return ds;
	}
}
