/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse.IO;

import com.warehouse.project.model.Output;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IOutput {

    public abstract Output Save(Output output);

    public abstract Output findAllId();

    public abstract List<Output> findall();

    public abstract Output findOne(String id);

    public abstract Output Update(Output output);

    public abstract void Delete(String id);
}
