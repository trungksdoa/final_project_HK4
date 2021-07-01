/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse.IO;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.InputContent;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IInputContent {

    public abstract InputContent Save(InputContent input);

    public List<InputContent> findAll();
}
