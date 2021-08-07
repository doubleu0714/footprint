import io.kotest.core.spec.style.ShouldSpec

class HelloKotest : ShouldSpec (
    {
        should("Hello Test") {
            println("Hello Test")
        }
    }    
)