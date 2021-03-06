package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String address;
	private Double latitude;
	private Double longitude;
	private Instant moment;
	private OrderStatus status;

	private List<ProductDTO> products = new ArrayList<>();

	public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
		this.id = id;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
	}

	public OrderDTO(Order order) {
		id = order.getId();
		address = order.getAddress();
		latitude = order.getLatitude();
		longitude = order.getLongitude();
		moment = order.getMoment();
		status = order.getStatus();
		products = order.getProducts().stream()
							.map(x -> new ProductDTO(x))
							.collect(Collectors.toList());
	}

}
