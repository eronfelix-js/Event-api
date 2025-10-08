package dev.felix.event_api.Core.UseCaases;

public class FilterIndetificationEventImpl {

    private String identification;

    public FilterIndetificationEventImpl(String identification) {
        this.identification = identification;
    }

    public String getIdentification() {
        return identification;
    }
}
