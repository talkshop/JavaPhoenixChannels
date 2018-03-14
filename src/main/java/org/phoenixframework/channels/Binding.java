package org.phoenixframework.channels;

class Binding {
    private final String event;
    private final IMessageCallback callback;

    public Binding(final String event, final IMessageCallback callback) {
        this.event = event;
        this.callback = callback;
    }

    public String getEvent() {
        return event;
    }

    public IMessageCallback getCallback() {
        return callback;
    }

    @Override
    public String toString() {
        return "Binding{" +
                "event='" + event + '\'' +
                ", callback=" + callback +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Binding) {
            Binding c = (Binding) o;
            return c.event.equals(event);
        }
        return false;
    }
}
