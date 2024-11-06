import java.text.SimpleDateFormat;
import java.util.Date;

class TimestampedMessage extends MessageDecorator {
    public TimestampedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return addTimestamp() + message.getContent();
    }

    private String addTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "[" + sdf.format(new Date()) + "] ";
    }
}