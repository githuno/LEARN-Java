package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Memberテーブル：エンティティ
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	/** Member番号 */
	@Id
	@Column("id")
	private Integer id;
	
	/** Member */
	@Column("val")
	private String val;
}