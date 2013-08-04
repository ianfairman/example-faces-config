package io.github.ianfairman.example.faces.config;

public class SampleController {
    
    private SampleModel model;

    public SampleController() {
        
    }
    
    public void setModel(SampleModel model) {
        this.model = model;
    }
    
    public String doStuff() {
        model.setOutput(model.getInput() + model.getInput());
        return null;
    }
}
