package cz.hurt.op

class Employee {

    var name: String? = null
    var surname: String? = null
    var rc: String? = null
    var mail: String? = null
    var phone: String? = null

    constructor(name: String?, surname: String?) {
        this.name = name
        this.surname = surname
    }

    constructor(name: String?, surname: String?, rc: String?) {
        this.name = name
        this.surname = surname
        this.rc = rc
    }


    fun sayFullName() : String {
        return name + " " + surname
    }
}