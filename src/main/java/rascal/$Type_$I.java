package rascal;
import io.usethesource.vallang.*;
import org.rascalmpl.runtime.function.*;

@SuppressWarnings("unused")
public interface $Type_$I  {
    IValue choice(IValue $0, IValue $1);
    IValue comparable(IValue $0, IValue $1);
    IValue eq(IValue $0, IValue $1);
    IValue equivalent(IValue $0, IValue $1);
    IValue glb(IValue $0, IValue $1);
    IValue intersects(IValue $0, IValue $1);
    IValue lrel(IValue $0);
    IValue lub(IValue $0, IValue $1);
    IValue make(IValue $0, IValue $1, IValue $2);
    IValue make(IValue $0, IValue $1, IValue $2, IValue $3);
    IValue overloaded(IValue $0);
    IValue rel(IValue $0);
    IValue subtype(IValue $0, IValue $1);
    IValue typeCast(IValue $0, IValue $1);
    IValue typeOf(IValue $0);
    IValue var_func(IValue $0, IValue $1, IValue $2);
}