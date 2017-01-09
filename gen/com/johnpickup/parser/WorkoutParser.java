// Generated from /Users/john/Development/GarminWorkoutCreator/grammar/Workout.g4 by ANTLR 4.6
package com.johnpickup.parser;

import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WorkoutParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, LETTER=13, DIGIT=14, POINT=15, COLON=16, 
		WS=17;
	public static final int
		RULE_workout = 0, RULE_stepList = 1, RULE_step = 2, RULE_distance_step = 3, 
		RULE_pace_step = 4, RULE_repeating_steps = 5, RULE_distance = 6, RULE_distance_unit = 7, 
		RULE_pace = 8, RULE_pace_range = 9, RULE_time = 10, RULE_number = 11, 
		RULE_cardinal = 12, RULE_name = 13;
	public static final String[] ruleNames = {
		"workout", "stepList", "step", "distance_step", "pace_step", "repeating_steps", 
		"distance", "distance_unit", "pace", "pace_range", "time", "number", "cardinal", 
		"name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'<'", "'>'", "'@'", "'('", "')'", "'*'", "'m'", "'mi'", 
		"'km'", "'/'", "'-'", null, null, "'.'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "LETTER", "DIGIT", "POINT", "COLON", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Workout.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WorkoutParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WorkoutContext extends ParserRuleContext {
		public Workout w;
		public StepListContext stepList;
		public StepListContext stepList() {
			return getRuleContext(StepListContext.class,0);
		}
		public WorkoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterWorkout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitWorkout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitWorkout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorkoutContext workout() throws RecognitionException {
		WorkoutContext _localctx = new WorkoutContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_workout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((WorkoutContext)_localctx).stepList = stepList();
			((WorkoutContext)_localctx).w =  new Workout(((WorkoutContext)_localctx).stepList.steps);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepListContext extends ParserRuleContext {
		public List<Step> steps;
		public StepContext s0;
		public StepContext s1;
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public StepListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterStepList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitStepList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitStepList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepListContext stepList() throws RecognitionException {
		StepListContext _localctx = new StepListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stepList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			((StepListContext)_localctx).s0 = step();
			((StepListContext)_localctx).steps =  new ArrayList<>(); _localctx.steps.add(((StepListContext)_localctx).s0.value);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(33);
				match(T__0);
				setState(34);
				((StepListContext)_localctx).s1 = step();
				_localctx.steps.add(((StepListContext)_localctx).s1.value);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepContext extends ParserRuleContext {
		public Step value;
		public Distance_stepContext distance_step;
		public Pace_stepContext pace_step;
		public Repeating_stepsContext repeating_steps;
		public Distance_stepContext distance_step() {
			return getRuleContext(Distance_stepContext.class,0);
		}
		public Pace_stepContext pace_step() {
			return getRuleContext(Pace_stepContext.class,0);
		}
		public Repeating_stepsContext repeating_steps() {
			return getRuleContext(Repeating_stepsContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_step);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((StepContext)_localctx).distance_step = distance_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).distance_step.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				((StepContext)_localctx).pace_step = pace_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).pace_step.value;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				((StepContext)_localctx).repeating_steps = repeating_steps();
				((StepContext)_localctx).value =  ((StepContext)_localctx).repeating_steps.value;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Distance_stepContext extends ParserRuleContext {
		public DistanceStep value;
		public DistanceContext distance;
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public Distance_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterDistance_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitDistance_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitDistance_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Distance_stepContext distance_step() throws RecognitionException {
		Distance_stepContext _localctx = new Distance_stepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_distance_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((Distance_stepContext)_localctx).distance = distance();
			((Distance_stepContext)_localctx).value =   new DistanceStep(((Distance_stepContext)_localctx).distance.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pace_stepContext extends ParserRuleContext {
		public PaceStep value;
		public DistanceContext distance;
		public PaceContext pace;
		public Pace_rangeContext pace_range;
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public PaceContext pace() {
			return getRuleContext(PaceContext.class,0);
		}
		public Pace_rangeContext pace_range() {
			return getRuleContext(Pace_rangeContext.class,0);
		}
		public Pace_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pace_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterPace_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitPace_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitPace_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pace_stepContext pace_step() throws RecognitionException {
		Pace_stepContext _localctx = new Pace_stepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pace_step);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((Pace_stepContext)_localctx).distance = distance();
				setState(57);
				match(T__1);
				setState(58);
				((Pace_stepContext)_localctx).pace = pace();
				((Pace_stepContext)_localctx).value =  new PaceStep(((Pace_stepContext)_localctx).distance.value, new MaximumPace(((Pace_stepContext)_localctx).pace.value));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((Pace_stepContext)_localctx).distance = distance();
				setState(62);
				match(T__2);
				setState(63);
				((Pace_stepContext)_localctx).pace = pace();
				((Pace_stepContext)_localctx).value =  new PaceStep(((Pace_stepContext)_localctx).distance.value, new MinimumPace(((Pace_stepContext)_localctx).pace.value));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				((Pace_stepContext)_localctx).distance = distance();
				setState(67);
				match(T__3);
				setState(68);
				((Pace_stepContext)_localctx).pace_range = pace_range();
				((Pace_stepContext)_localctx).value =  new PaceStep(((Pace_stepContext)_localctx).distance.value, ((Pace_stepContext)_localctx).pace_range.value);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeating_stepsContext extends ParserRuleContext {
		public RepeatingSteps value;
		public StepContext s1;
		public StepContext s2;
		public CardinalContext cardinal;
		public CardinalContext cardinal() {
			return getRuleContext(CardinalContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public Repeating_stepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeating_steps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterRepeating_steps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitRepeating_steps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitRepeating_steps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeating_stepsContext repeating_steps() throws RecognitionException {
		Repeating_stepsContext _localctx = new Repeating_stepsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repeating_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(74);
			((Repeating_stepsContext)_localctx).s1 = step();
			((Repeating_stepsContext)_localctx).value =  new RepeatingSteps(((Repeating_stepsContext)_localctx).s1.value);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(76);
				match(T__0);
				setState(77);
				((Repeating_stepsContext)_localctx).s2 = step();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.value.addStep(((Repeating_stepsContext)_localctx).s2.value);
			setState(84);
			match(T__5);
			setState(85);
			match(T__6);
			setState(86);
			((Repeating_stepsContext)_localctx).cardinal = cardinal();
			_localctx.value.setRepetitions(((Repeating_stepsContext)_localctx).cardinal.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistanceContext extends ParserRuleContext {
		public Distance value;
		public NumberContext number;
		public Distance_unitContext distance_unit;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Distance_unitContext distance_unit() {
			return getRuleContext(Distance_unitContext.class,0);
		}
		public DistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitDistance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitDistance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((DistanceContext)_localctx).number = number();
			setState(90);
			((DistanceContext)_localctx).distance_unit = distance_unit();
			((DistanceContext)_localctx).value =  new Distance(((DistanceContext)_localctx).number.value, ((DistanceContext)_localctx).distance_unit.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Distance_unitContext extends ParserRuleContext {
		public DistanceUnit value;
		public Distance_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterDistance_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitDistance_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitDistance_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Distance_unitContext distance_unit() throws RecognitionException {
		Distance_unitContext _localctx = new Distance_unitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_distance_unit);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__7);
				((Distance_unitContext)_localctx).value =  DistanceUnit.METRE;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__8);
				((Distance_unitContext)_localctx).value =   DistanceUnit.MILE;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(T__9);
				((Distance_unitContext)_localctx).value =   DistanceUnit.KILOMETRE;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PaceContext extends ParserRuleContext {
		public PaceLimit value;
		public TimeContext time;
		public Distance_unitContext distance_unit;
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Distance_unitContext distance_unit() {
			return getRuleContext(Distance_unitContext.class,0);
		}
		public PaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterPace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitPace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitPace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaceContext pace() throws RecognitionException {
		PaceContext _localctx = new PaceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((PaceContext)_localctx).time = time();
			setState(102);
			match(T__10);
			setState(103);
			((PaceContext)_localctx).distance_unit = distance_unit();
			((PaceContext)_localctx).value =  new PaceLimit(((PaceContext)_localctx).time.value, PaceUnit.perDistanceUnit(((PaceContext)_localctx).distance_unit.value));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pace_rangeContext extends ParserRuleContext {
		public Pace value;
		public TimeContext t1;
		public TimeContext t2;
		public Distance_unitContext distance_unit;
		public Distance_unitContext distance_unit() {
			return getRuleContext(Distance_unitContext.class,0);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Pace_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pace_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterPace_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitPace_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitPace_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pace_rangeContext pace_range() throws RecognitionException {
		Pace_rangeContext _localctx = new Pace_rangeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pace_range);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((Pace_rangeContext)_localctx).t1 = time();
				setState(107);
				match(T__11);
				setState(108);
				((Pace_rangeContext)_localctx).t2 = time();
				setState(109);
				match(T__10);
				setState(110);
				((Pace_rangeContext)_localctx).distance_unit = distance_unit();
				((Pace_rangeContext)_localctx).value =  new PaceRange(((Pace_rangeContext)_localctx).t1.value, ((Pace_rangeContext)_localctx).t2.value, PaceUnit.perDistanceUnit(((Pace_rangeContext)_localctx).distance_unit.value));
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				name();
				((Pace_rangeContext)_localctx).value =  new PaceName(_input.getText(_localctx.start, _input.LT(-1)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public Time value;
		public TerminalNode COLON() { return getToken(WorkoutParser.COLON, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(WorkoutParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(WorkoutParser.DIGIT, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				match(DIGIT);
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(123);
			match(COLON);
			setState(124);
			match(DIGIT);
			setState(125);
			match(DIGIT);
			((TimeContext)_localctx).value =  Time.parseTime(_input.getText(_localctx.start, _input.LT(-1)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public double value;
		public List<TerminalNode> DIGIT() { return getTokens(WorkoutParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(WorkoutParser.DIGIT, i);
		}
		public TerminalNode POINT() { return getToken(WorkoutParser.POINT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				match(DIGIT);
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(133);
				match(POINT);
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					match(DIGIT);
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			((NumberContext)_localctx).value =  Double.parseDouble(_input.getText(_localctx.start, _input.LT(-1)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CardinalContext extends ParserRuleContext {
		public int value;
		public List<TerminalNode> DIGIT() { return getTokens(WorkoutParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(WorkoutParser.DIGIT, i);
		}
		public CardinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterCardinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitCardinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitCardinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardinalContext cardinal() throws RecognitionException {
		CardinalContext _localctx = new CardinalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cardinal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				match(DIGIT);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			((CardinalContext)_localctx).value =  Integer.parseInt(_input.getText(_localctx.start, _input.LT(-1)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(WorkoutParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(WorkoutParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(WorkoutParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(WorkoutParser.DIGIT, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(LETTER);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(151);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7T\13\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tf\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13w\n\13\3\f\6\fz\n\f\r\f\16\f{\3\f\3\f\3\f\3\f\3\f\3\r\6\r\u0084\n"+
		"\r\r\r\16\r\u0085\3\r\3\r\6\r\u008a\n\r\r\r\16\r\u008b\5\r\u008e\n\r\3"+
		"\r\3\r\3\16\6\16\u0093\n\16\r\16\16\16\u0094\3\16\3\16\3\17\3\17\7\17"+
		"\u009b\n\17\f\17\16\17\u009e\13\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\3\3\2\17\20\u00a0\2\36\3\2\2\2\4!\3\2\2\2\6\65\3\2\2\2"+
		"\b\67\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16[\3\2\2\2\20e\3\2\2\2\22g\3\2\2"+
		"\2\24v\3\2\2\2\26y\3\2\2\2\30\u0083\3\2\2\2\32\u0092\3\2\2\2\34\u0098"+
		"\3\2\2\2\36\37\5\4\3\2\37 \b\2\1\2 \3\3\2\2\2!\"\5\6\4\2\")\b\3\1\2#$"+
		"\7\3\2\2$%\5\6\4\2%&\b\3\1\2&(\3\2\2\2\'#\3\2\2\2(+\3\2\2\2)\'\3\2\2\2"+
		")*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,-\5\b\5\2-.\b\4\1\2.\66\3\2\2\2/\60\5"+
		"\n\6\2\60\61\b\4\1\2\61\66\3\2\2\2\62\63\5\f\7\2\63\64\b\4\1\2\64\66\3"+
		"\2\2\2\65,\3\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\7\3\2\2\2\678\5\16\b\2"+
		"89\b\5\1\29\t\3\2\2\2:;\5\16\b\2;<\7\4\2\2<=\5\22\n\2=>\b\6\1\2>J\3\2"+
		"\2\2?@\5\16\b\2@A\7\5\2\2AB\5\22\n\2BC\b\6\1\2CJ\3\2\2\2DE\5\16\b\2EF"+
		"\7\6\2\2FG\5\24\13\2GH\b\6\1\2HJ\3\2\2\2I:\3\2\2\2I?\3\2\2\2ID\3\2\2\2"+
		"J\13\3\2\2\2KL\7\7\2\2LM\5\6\4\2MR\b\7\1\2NO\7\3\2\2OQ\5\6\4\2PN\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\b\7\1\2VW\7\b\2"+
		"\2WX\7\t\2\2XY\5\32\16\2YZ\b\7\1\2Z\r\3\2\2\2[\\\5\30\r\2\\]\5\20\t\2"+
		"]^\b\b\1\2^\17\3\2\2\2_`\7\n\2\2`f\b\t\1\2ab\7\13\2\2bf\b\t\1\2cd\7\f"+
		"\2\2df\b\t\1\2e_\3\2\2\2ea\3\2\2\2ec\3\2\2\2f\21\3\2\2\2gh\5\26\f\2hi"+
		"\7\r\2\2ij\5\20\t\2jk\b\n\1\2k\23\3\2\2\2lm\5\26\f\2mn\7\16\2\2no\5\26"+
		"\f\2op\7\r\2\2pq\5\20\t\2qr\b\13\1\2rw\3\2\2\2st\5\34\17\2tu\b\13\1\2"+
		"uw\3\2\2\2vl\3\2\2\2vs\3\2\2\2w\25\3\2\2\2xz\7\20\2\2yx\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\22\2\2~\177\7\20\2\2\177\u0080"+
		"\7\20\2\2\u0080\u0081\b\f\1\2\u0081\27\3\2\2\2\u0082\u0084\7\20\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u008d\3\2\2\2\u0087\u0089\7\21\2\2\u0088\u008a\7\20\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\b\r\1\2\u0090\31\3\2\2\2\u0091\u0093\7\20\2"+
		"\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\16\1\2\u0097\33\3\2\2\2\u0098"+
		"\u009c\7\17\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\35\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\16)\65IRev{\u0085\u008b\u008d\u0094\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}