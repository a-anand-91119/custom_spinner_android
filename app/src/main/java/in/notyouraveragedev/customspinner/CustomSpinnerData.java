package in.notyouraveragedev.customspinner;

/**
 * Created by A Anand on 08-05-2020
 */
public class CustomSpinnerData {

    private String textForSpinner;
    private int imageForSpinner;

    CustomSpinnerData(String textForSpinner, int imageIdForSpinner) {
        this.textForSpinner = textForSpinner;
        this.imageForSpinner = imageIdForSpinner;
    }

    public CustomSpinnerData() {
    }

    public String getTextForSpinner() {
        return textForSpinner;
    }

    public void setTextForSpinner(String textForSpinner) {
        this.textForSpinner = textForSpinner;
    }

    public int getImageForSpinner() {
        return imageForSpinner;
    }

    public void setImageForSpinner(int imageIdForSpinner) {
        this.imageForSpinner = imageIdForSpinner;
    }

    @Override
    public String toString() {
        return "CustomSpinnerData{" +
                "textForSpinner='" + textForSpinner + '\'' +
                ", imageForSpinner=" + imageForSpinner +
                '}';
    }
}
