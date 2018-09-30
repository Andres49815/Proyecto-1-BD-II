package prendapps;

import java.io.Serializable;

import java.math.BigDecimal;

public class LineRequestPK implements Serializable {
    private BigDecimal lineId;
    private BigDecimal requestId;

    public LineRequestPK() {
    }

    public LineRequestPK(BigDecimal lineId, BigDecimal requestId) {
        this.lineId = lineId;
        this.requestId = requestId;
    }

    public boolean equals(Object other) {
        if (other instanceof LineRequestPK) {
            final LineRequestPK otherLineRequestPK = (LineRequestPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public BigDecimal getLineId() {
        return lineId;
    }

    public void setLineId(BigDecimal lineId) {
        this.lineId = lineId;
    }

    public BigDecimal getRequestId() {
        return requestId;
    }

    public void setRequestId(BigDecimal requestId) {
        this.requestId = requestId;
    }
}
