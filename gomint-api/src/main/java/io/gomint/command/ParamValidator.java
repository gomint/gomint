package io.gomint.command;

import java.util.Iterator;
import java.util.List;

/**
 * @author geNAZt
 * @version 1.0
 */
public abstract class ParamValidator {

    private boolean optional;
    private boolean nullable;
    private String postfix;

    /**
     * Get the type of this param.
     *
     * @return type of param
     */
    public abstract ParamType getType();

    /**
     * Does this validator have values which should be sent with the command. This is
     * mostly used by enum params which define a set of values for selection.
     *
     * @return true when there is data to be sent with this parameter, false when not
     */
    public abstract boolean hasValues();

    /**
     * Get the values when {@link #hasValues()} is true.
     *
     * @return sorted list of values
     */
    public abstract List<String> values();

    /**
     * Validates given input
     *
     * @param input         from the command
     * @param commandSender which submitted the command
     * @return non null object of validation on success (string for example) or null when validation failed
     */
    public abstract Object validate( String input, CommandSender commandSender );

    /**
     * Is this param optional?
     *
     * @return true when its optional, false when not
     */
    public boolean isOptional() {
        return this.optional;
    }

    /**
     * Set to optional
     *
     * @param optional true when this parameter is optional, false when not
     */
    public void setOptional( boolean optional ) {
        this.optional = optional;
    }

    /**
     * Is this param nullable?
     *
     * @return true when its nullable, false when not
     */
    public boolean isNullable() {
        return this.nullable;
    }

    /**
     * Set to nullable
     *
     * @param nullable true when this parameter is nullable, false when not
     */
    public void setNullable( boolean nullable ) {
        this.nullable = nullable;
    }

    /**
     * Get the attached postfix for this param validator
     *
     * @return postfix of this validator
     */
    public String getPostfix() {
        return this.postfix;
    }

    /**
     * Set the postfix for this param validator. Postfixes are currently only supported
     * on int validators, if set to something else it will be ignored.
     *
     * @param postfix which should be used
     */
    public void setPostfix( String postfix ) {
        this.postfix = postfix;
    }

    /**
     * Get a proper help text for the console output
     *
     * @return help text for the console
     */
    public String getHelpText() {
        return "NO HELP";
    }

    /**
     * Consume all parts this validator needs as input from the command
     *
     * @param data left from the command which can be consumed
     * @return the concated data consumed
     */
    public abstract String consume( Iterator<String> data );

}
