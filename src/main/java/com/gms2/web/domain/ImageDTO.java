package com.gms2.web.domain;

import org.springframework.stereotype.Controller;

import lombok.Data;

@Controller
@Data
public class ImageDTO {
	private String imgSeq, 
				imgName,
				extension,
				memId;
}
