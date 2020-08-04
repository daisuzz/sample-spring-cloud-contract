package contracts;

import org.springframework.cloud.contract.spec.Contract;
import org.springframework.cloud.contract.verifier.util.ContractVerifierUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Supplier;

public class UserContract implements Supplier<Collection<Contract>> {

    @Override
    public Collection<Contract> get() {
        return Collections.singletonList(Contract.make(c -> {
            c.description("Sample contract");
            c.name("userContract");
            c.request(r -> {
                r.url("/user");
                r.method(r.GET());
            });
            c.response(r -> {
                r.status(200);
                r.headers(h -> {
                    h.contentType("application/json");
                });
                r.body(ContractVerifierUtil.map()
                        .entry("lastName", "Yamada")
                        .entry("firstName", "Taro")
                        .entry("age", 20));
            });
        }));
    }
}
