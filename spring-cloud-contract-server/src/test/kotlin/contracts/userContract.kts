import org.springframework.cloud.contract.spec.ContractDsl.Companion.contract
import org.springframework.cloud.contract.spec.withQueryParameters

contract {
    name = "Sample contract"
    description = "userContract"
    request {
        url = url("/user")
        method = GET
    }
    response {
        status = OK
        headers {
            header("Content-Type", "application/json")
        }
        body = body(mapOf(
                "lastName" to "Yamada",
                "firstName" to "Taro",
                "age" to 20)
        )
    }
}
