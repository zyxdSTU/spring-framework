package com.zy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhouyu
 * @create 2023-12-04 10:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School {
	private Long schoolId;
	private String schoolName;
	private String schoolTel;
}
