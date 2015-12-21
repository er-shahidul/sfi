package com.rbs.www.common.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FileValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object File, Errors errors) {

//		ImageFile file = (ImageFile) File;
//
//		if (file.getFile().getSize() == 0) {
//			errors.rejectValue("file", "uploadForm.error",
//					"Please select a file!");
//		}
//
//        // 100 MB
//        if (file.getFile().getSize() > 100000000) {
//            errors.rejectValue("file", "uploadForm.error1",
//                    "Please select a file!");
//        }

	}

}
