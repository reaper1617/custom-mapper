package com.gerasimchuk.mfkmapper;

import com.gerasimchuk.mfkmapper.mapper_api.api.MapperFactory;
import com.gerasimchuk.mfkmapper.mapper_api.api.MappingContextFactory;
import com.gerasimchuk.mfkmapper.mapper_api.impl.MapperContextFactoryDummyImpl;
import com.gerasimchuk.mfkmapper.mapper_api.impl.MapperFactoryDummyImpl;
import com.gerasimchuk.mfkmapper.dto_samples.BasePojoDto;
import com.gerasimchuk.mfkmapper.dto_samples.FirstInnerLevelPojoDto;
import com.gerasimchuk.mfkmapper.entity_samples.BasePojoEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MfkBuilderApplication {

  public static void main(String[] args) {
    SpringApplication.run(MfkBuilderApplication.class, args);


    MappingContextFactory mappingContextFactory = new MapperContextFactoryDummyImpl();


    MapperFactory mapperFactory = new MapperFactoryDummyImpl();

    var mapContexts = mappingContextFactory.get(BasePojoDto.class, BasePojoEntity.class);

    var mapper =mapperFactory.get(BasePojoDto.class, BasePojoEntity.class);


    var dto = new BasePojoDto();
    dto.setStringField("Example String FIELD");
    dto.setInners(
            List.of(
                    new FirstInnerLevelPojoDto(
                            15,
                            List.of()
                    )
            )
    );

    var mapContext = mapContexts.get(0);

    var mapResult = mapper.map(dto, mapContext);

    System.out.println("Mapped from: " + dto);
    System.out.println("Mapped to: " + mapResult);

  }

}
