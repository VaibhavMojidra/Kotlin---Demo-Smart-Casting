fun printLength(obj: Any) {
	if (obj is String) {
		println("Length of the string is ${obj.length}") // obj is smart cast to String here
	} else {
		println("Object is not a String")
	}
}


fun main(args: Array<String>) {
	printLength("Hello, Kotlin")
	printLength(123)
}