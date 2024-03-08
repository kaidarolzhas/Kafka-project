package kz.olzhas.kafka.kafkaproject.web.mapper;


public interface Mappable<E, D> {
    E toEntity(D dto);

    D toDto(E e);
}
