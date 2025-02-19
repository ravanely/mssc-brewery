package guru.springframework.msscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author ravnely
 * @project mssc-brewery
 * @Created 13/02/2022, 14:55:39, dim.
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    private Timestamp createdDate;
    private Timestamp lastModifiedDate;
}
