package com.company.Parser;

import Practic14.Exceptions.FormatParserException;
import Practic14.Expression.TripleExpression;


public interface Parser {
    TripleExpression parse(String expression) throws FormatParserException;
}