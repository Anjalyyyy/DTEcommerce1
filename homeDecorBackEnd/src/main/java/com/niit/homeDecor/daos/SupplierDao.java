package com.niit.homeDecor.daos;
import java.util.List;

import com.niit.homeDecor.models.Supplier;

public interface SupplierDao  {
	public void insertSupplier(Supplier supplier);
	public List<Supplier> getSuppliers();
    public Supplier getSupplier(String sid);


}
