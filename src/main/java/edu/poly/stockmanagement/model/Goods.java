package edu.poly.stockmanagement.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * The persistent class for the goods database table.
 * 
 */
@Entity
@Table(name = "goods")
public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GOODS_ID", unique = true, nullable = false)
	private Integer id;

	@Column(name = "GOODS_CODE", nullable = false, length = 8)
	private String code;

	@Temporal(TemporalType.DATE)
	@Column(name = "GOODS_EXPIRATION", nullable = false)
	private Date expiration;

	@Column(name = "GOODS_EXPORT_PRICE", nullable = false)
	private Integer exportPrice;

	@Column(name = "GOODS_FEATURE", nullable = false, length = 45)
	private String feature;

	@Column(name = "GOODS_IMPORT_PRICE", nullable = false)
	private Integer importPrice;

	@Column(name = "GOODS_LOTNUMBER", length = 16)
	private String lotNumber;

	@Column(name = "GOODS_NAME", nullable = false, length = 64)
	private String name;

	@Column(name = "GOODS_NEW_BRAND", nullable = false)
	private Boolean newBrand;

	@Column(name = "GOODS_UNIT", nullable = false, length = 16)
	private String unit;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private Category category;

	@ManyToOne
	@JoinColumn(name = "PRODUCER_ID", nullable = false)
	private Producer producer;

	@ManyToOne
	@JoinColumn(name = "SUPPLIER_ID", nullable = false)
	private Supplier supplier;

	@OneToMany(mappedBy = "goods")
	private Set<Inventory> inventories;

	public Goods() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getExpiration() {
		return this.expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public Integer getExportPrice() {
		return this.exportPrice;
	}

	public void setExportPrice(Integer exportPrice) {
		this.exportPrice = exportPrice;
	}

	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public Integer getImportPrice() {
		return this.importPrice;
	}

	public void setImportPrice(Integer importPrice) {
		this.importPrice = importPrice;
	}

	public String getLotNumber() {
		return this.lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getNewBrand() {
		return this.newBrand;
	}

	public void setNewBrand(Boolean newBrand) {
		this.newBrand = newBrand;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Producer getProducer() {
		return this.producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Set<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	public Inventory addInventory(Inventory inventory) {
		getInventories().add(inventory);
		inventory.setGood(this);

		return inventory;
	}

	public Inventory removeInventory(Inventory inventory) {
		getInventories().remove(inventory);
		inventory.setGood(null);

		return inventory;
	}

	@Override
	public String toString() {
		return String.format(
				"Goods [id=%s, code=%s, expiration=%s, exportPrice=%s, feature=%s, importPrice=%s, lotNumber=%s, name=%s, newBrand=%s, unit=%s, category=%s, producer=%s, supplier=%s]",
				id, code, expiration, exportPrice, feature, importPrice, lotNumber, name, newBrand, unit, category,
				producer, supplier);
	}

}