package Assignment8.Element;

import Assignment8.Visitor.IVisitor;

public interface IDevice {
    public String accept(IVisitor visitor);
}
