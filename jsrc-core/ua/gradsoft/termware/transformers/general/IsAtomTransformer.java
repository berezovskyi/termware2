package ua.gradsoft.termware.transformers.general;


/*
 * (C) Ruslan Shevchenko <Ruslan@Shevchenko.Kiev.UA> 2002-2005
 * $Id: IsAtomTransformer.java,v 1.1 2005-04-02 18:29:23 rssh Exp $
 */

import ua.gradsoft.termware.AbstractBuildinTransformer;
import ua.gradsoft.termware.Term;
import ua.gradsoft.termware.TermFactory;
import ua.gradsoft.termware.TermSystem;
import ua.gradsoft.termware.TermWareException;
import ua.gradsoft.termware.TransformationContext;
            

/**
 * isAtom(x) = true if term 'x' is atom;
 */
public class IsAtomTransformer extends AbstractBuildinTransformer
{

 public  Term  transform(Term t, TermSystem system, TransformationContext ctx) throws TermWareException
  { return static_transform(t,system,ctx); }


static public  Term  static_transform(Term t, TermSystem system, TransformationContext ctx) throws TermWareException
 {
  //if (!t.getName().equals("isString")) return t;
  if (t.getArity()!=1) {
     return t;
  }  
  ctx.setChanged(true);
  return system.getInstance().getTermFactory().createBoolean(t.getSubtermAt(0).isAtom());
 }


 public String getDescription() {
     return "isAtom(x) = true if term 'x' is atom.";
 }
 
 public String getName() {
     return "isAtom";
 }

    public boolean internalsAtFirst() {
        return false;
    }
 
}
 