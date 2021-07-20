/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author lenovo
 */
public interface IFileUploaderService {
    
	public void uploadFile(MultipartFile file);
}
