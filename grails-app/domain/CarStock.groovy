class CarStock {
	static belongsTo = [colour:Colour,brand:CarBrand,engine:Engine,fuel:Fuel,type:CarType,gear:Gear]
	static hasMany = [revervedDetail:ReservedDetail]
	String model
	String carRegistration
	Boolean reserved
    static constraints = {
		brand()
		model()
		colour()
		gear()
		type()
		engine()
		fuel()
		carRegistration(nullable:false)		
		reserved()
    }
	String toString()
	{
		return "$id - $carRegistration"
	}
}
