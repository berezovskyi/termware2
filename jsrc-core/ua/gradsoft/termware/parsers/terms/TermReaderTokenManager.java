/* Generated By:JavaCC: Do not edit this line. TermReaderTokenManager.java */
package ua.gradsoft.termware.parsers.terms;
import java.io.*;
import java.util.*;
import java.math.*;
import ua.gradsoft.termware.*;
import ua.gradsoft.termware.exceptions.*;
import ua.gradsoft.termware.parsers.terms.util.*;

public class TermReaderTokenManager implements TermReaderConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x84000000000000L) != 0L)
            return 14;
         if ((active0 & 0x100000000000000L) != 0L)
            return 24;
         if ((active0 & 0x30c2100L) != 0L)
         {
            jjmatchedKind = 26;
            return 20;
         }
         return -1;
      case 1:
         if ((active0 & 0x10c2100L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 1;
            return 20;
         }
         if ((active0 & 0x2000000L) != 0L)
            return 20;
         return -1;
      case 2:
         if ((active0 & 0xc2000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 2;
            return 20;
         }
         if ((active0 & 0x1000100L) != 0L)
            return 20;
         return -1;
      case 3:
         if ((active0 & 0x82000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
            return 20;
         }
         if ((active0 & 0x40000L) != 0L)
            return 20;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 48;
         return jjMoveStringLiteralDfa1_0(0x400004000L);
      case 35:
         return jjMoveStringLiteralDfa1_0(0x100000000000000L);
      case 37:
         return jjStopAtPos(0, 47);
      case 38:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 40:
         return jjStopAtPos(0, 9);
      case 41:
         return jjStopAtPos(0, 10);
      case 42:
         return jjStopAtPos(0, 44);
      case 43:
         return jjStopAtPos(0, 42);
      case 44:
         return jjStopAtPos(0, 52);
      case 45:
         jjmatchedKind = 43;
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 46:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_0(0x80000000000000L);
      case 47:
         jjmatchedKind = 45;
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 58:
         jjmatchedKind = 51;
         return jjMoveStringLiteralDfa1_0(0x40000000000000L);
      case 59:
         return jjStopAtPos(0, 7);
      case 60:
         jjmatchedKind = 35;
         return jjMoveStringLiteralDfa1_0(0x12000008000L);
      case 61:
         return jjMoveStringLiteralDfa1_0(0x8200000000L);
      case 62:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x24000000000L);
      case 63:
         return jjStopAtPos(0, 53);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 91:
         return jjStopAtPos(0, 11);
      case 93:
         return jjStopAtPos(0, 12);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 123:
         return jjStopAtPos(0, 16);
      case 124:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 125:
         return jjStopAtPos(0, 17);
      case 126:
         return jjStopAtPos(0, 49);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      case 45:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 46:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(1, 55);
         break;
      case 47:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 46);
         break;
      case 58:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         break;
      case 60:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 61:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      case 62:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      case 64:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         break;
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 110:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 20);
         break;
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 124:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(2, 14);
         break;
      case 76:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 24, 20);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(2, 8, 20);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 20);
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 20);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 20);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 42;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 24:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(25, 26);
                  else if (curChar == 10)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                     jjCheckNAddStates(0, 7);
                  }
                  else if (curChar == 35)
                     jjAddStates(8, 9);
                  else if (curChar == 36)
                     jjCheckNAdd(22);
                  else if (curChar == 46)
                     jjCheckNAdd(14);
                  else if (curChar == 34)
                     jjCheckNAddStates(10, 12);
                  break;
               case 1:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 3:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 4:
                  if (curChar == 34 && kind > 21)
                     kind = 21;
                  break;
               case 5:
                  if (curChar == 48)
                     jjCheckNAddStates(13, 16);
                  break;
               case 6:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(13, 16);
                  break;
               case 7:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(17, 20);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(17, 20);
                  break;
               case 9:
                  if (curChar == 48)
                     jjAddStates(21, 22);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  break;
               case 13:
                  if (curChar == 46)
                     jjCheckNAdd(14);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddStates(27, 29);
                  break;
               case 16:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(17);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(17, 18);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 21:
                  if (curChar == 36)
                     jjCheckNAdd(22);
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(22);
                  break;
               case 23:
                  if (curChar == 35)
                     jjAddStates(8, 9);
                  break;
               case 25:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(25, 26);
                  break;
               case 26:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 27:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAddStates(0, 7);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAddTwoStates(29, 30);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 32:
                  if (curChar != 46)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddStates(30, 32);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddStates(30, 32);
                  break;
               case 35:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(36);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(36, 18);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 39:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(40);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(40, 18);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(41, 18);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 24:
                  if ((0xfffffffffffffffeL & l) != 0L)
                     jjCheckNAddTwoStates(25, 26);
                  break;
               case 0:
               case 20:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(20);
                  break;
               case 1:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 2:
                  if (curChar == 92)
                     jjAddStates(33, 36);
                  break;
               case 3:
                  if ((0x54404410000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 10:
                  if (curChar == 120)
                     jjCheckNAdd(11);
                  break;
               case 11:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  break;
               case 12:
                  if (curChar == 88)
                     jjCheckNAdd(11);
                  break;
               case 15:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(37, 38);
                  break;
               case 18:
                  if ((0x5000000054L & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 22:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 25:
                  jjCheckNAddTwoStates(25, 26);
                  break;
               case 30:
                  if ((0x1004L & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 34:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(39, 40);
                  break;
               case 38:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(41, 42);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 24:
               case 25:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(25, 26);
                  break;
               case 1:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(10, 12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 42 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   29, 30, 31, 32, 37, 38, 41, 18, 24, 27, 1, 2, 4, 1, 2, 6, 
   4, 1, 2, 8, 4, 10, 12, 1, 2, 11, 4, 14, 15, 18, 33, 34, 
   18, 3, 5, 7, 9, 16, 17, 35, 36, 39, 40, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default : 
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\73", "\154\145\164", "\50", "\51", 
"\133", "\135", "\167\150\145\162\145", "\41\55\76", "\74\55", "\173", "\175", 
"\164\162\165\145", "\146\141\154\163\145", null, null, null, null, "\116\111\114", "\151\156", 
null, null, "\55\76", "\174\174", "\46\46", "\174", "\46", "\75\75", "\41\75", 
"\74", "\76", "\74\75", "\76\75", "\75\76", "\74\74", "\76\76", "\53", "\55", "\52", 
"\57", "\57\57", "\45", "\41", "\176", "\56", "\72", "\54", "\77", "\72\72", 
"\56\56", "\43\100", };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x1ffffffff7fff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static final long[] jjtoSpecial = {
   0x60L, 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[42];
private final int[] jjstateSet = new int[84];
protected char curChar;
public TermReaderTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public TermReaderTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 42; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
