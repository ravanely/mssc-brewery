package guru.springframework.msscbrewery.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author ravnely
 * @project mssc-brewery
 * @Created 13/02/2022, 14:56:32, dim.
 **/
@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDToToBeer(BeerDto beerDto);
}
