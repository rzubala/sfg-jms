package guru.springframework.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = -5193824657303558577L;

    private UUID id;
    private String message;
}
