fun main() {
    // نسبت تبدیل از dp به sdp
    val conversionRatio = 0.833

    // درخواست مقدار dp از کاربر
    println("Enter the value in dp: ")
    val dpInput = readlnOrNull()?.toDoubleOrNull()

    // بررسی ورودی کاربر
    if (dpInput != null) {
        // تبدیل dp به sdp و رند کردن نتیجه
        val sdpValue = (dpInput * conversionRatio).toInt()

        // نمایش نتیجه
        println("The equivalent value in sdp is: $sdpValue")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}
