/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.codebyexample.springbootstarter.services;


import io.codebyexample.springbootstarter.properties.SampleProperties;

/**
 * @author huypva
 */
public class SampleServiceImpl implements SampleService {

  private SampleProperties sampleProperties;

  public SampleServiceImpl(SampleProperties sampleProperties) {
      this.sampleProperties = sampleProperties;
  }

  @Override
  public void doSample() {
    System.out.println("Do sample: " + sampleProperties.value);
  }
}
