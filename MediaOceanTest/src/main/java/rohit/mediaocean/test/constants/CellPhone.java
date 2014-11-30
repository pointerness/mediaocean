package rohit.mediaocean.test.constants;

public enum CellPhone {

	SAMSUNG("SAMSUNG"),LG("LG"),MOTOROLA("MOTOROLA"),HTC("HTC"),ASUS("ASUS"),MICROMAX("MICROMAX"),XAOMI("XAOMI"),NOKIA("NOKIA"),
	GEONEE("GEONEE");

	private final String manufacturerName;

	private CellPhone(String productName) {
		this.manufacturerName = productName;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}
}
