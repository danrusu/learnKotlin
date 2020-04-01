package functions

fun main() {
    connect("qatools.ro") // default param
    connect("google.com", false)
    connect(useProxy = false, url = "yahoo.com") // named param
}

@JvmOverloads // java does not have default params; generate overloads for that
fun connect(url: String, useProxy: Boolean = true) {
    println("Connected to $url ${if (useProxy) "with" else "without"} proxi")
}