package com.webapp.bankingportal.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ApiMessages {
    ACCOUNT_NOT_FOUND("Account does not exist"),
    AMOUNT_EXCEED_100_000_ERROR("Amount cannot be greater than 100,000"),
    AMOUNT_INVALID_ERROR("Invalid amount"),
    AMOUNT_NEGATIVE_ERROR("Amount must be greater than 0"),
    AMOUNT_NOT_MULTIPLE_OF_100_ERROR("Amount must be in multiples of 100"),
    BALANCE_INSUFFICIENT_ERROR("Insufficient balance"),
    CASH_DEPOSIT_SUCCESS("{\"msg\": \"現金入金完了\"}"),
    CASH_TRANSFER_SAME_ACCOUNT_ERROR("Source and target account cannot be the same"),
    CASH_TRANSFER_SUCCESS("{\"msg\": \"振込が成功しました\"}"),
    CASH_WITHDRAWAL_SUCCESS("{\"msg\": \"現金は正常に引き出されました\"}"),
    EMAIL_SUBJECT_LOGIN("New login to WeavusBank"),
    EMAIL_SUBJECT_OTP("OTP Verification"),
    GEOLOCATION_FAILED("Failed to get geolocation for IP: %s"),
    IDENTIFIER_MISSING_ERROR("Missing identifier"),
    OTP_GENERATION_LIMIT_EXCEEDED("OTP generation limit exceeded. Please try again after %d minutes"),
    OTP_INVALID_ERROR("Invalid OTP"),
    OTP_MISSING_ERROR("Missing OTP"),
    OTP_SENT_FAILURE("{\"message\": \"Failed to send OTP to: %s\"}"),
    OTP_SENT_SUCCESS("{\"message\": \"OTP sent successfully to: %s\"}"),
    PASSWORD_CONTAINS_WHITESPACE_ERROR("Password cannot contain any whitespace characters"),
    PASSWORD_EMPTY_ERROR("Password cannot be empty"),
    PASSWORD_INVALID_ERROR("Invalid password"),
    PASSWORD_REQUIREMENTS_ERROR("Password must contain at least %s"),
    PASSWORD_RESET_FAILURE("Failed to reset password"),
    PASSWORD_RESET_SUCCESS("{\"message\": \"Password reset successfully\"}"),
    PASSWORD_RESET_TOKEN_ISSUED("{\"passwordResetToken\": \"%s\"}"),
    PASSWORD_TOO_LONG_ERROR("Password must be less than 128 characters long"),
    PASSWORD_TOO_SHORT_ERROR("Password must be at least 8 characters long"),
    PIN_ALREADY_EXISTS("PIN already created"),
    PIN_CREATED("PIN has been created for this account"),
    PIN_CREATION_SUCCESS("{\"hasPIN\": true, \"msg\": \"PINが正常に作成されました\"}"),
    PIN_EMPTY_ERROR("PIN cannot be empty"),
    PIN_FORMAT_INVALID_ERROR("PIN must be 4 digits"),
    PIN_INVALID_ERROR("Invalid PIN"),
    PIN_NOT_CREATED("PIN has not been created for this account"),
    PIN_UPDATE_SUCCESS("{\"hasPIN\": false, \"msg\": \"PIN updated successfully\"}"),
    TOKEN_ALREADY_EXISTS_ERROR("Token already exists"),
    TOKEN_EMPTY_ERROR("Token is empty"),
    TOKEN_EXPIRED_ERROR("Token has expired"),
    TOKEN_INVALID_ERROR("Token is invalid"),
    TOKEN_ISSUED_SUCCESS("{ \"token\": \"%s\" }"),
    TOKEN_MALFORMED_ERROR("Token is malformed"),
    TOKEN_NOT_FOUND_ERROR("Token not found"),
    TOKEN_SIGNATURE_INVALID_ERROR("Token signature is invalid"),
    TOKEN_UNSUPPORTED_ERROR("Token is not supported"),
    USER_ADDRESS_EMPTY_ERROR("Address cannot be empty"),
	/*
	 * USER_COUNTRY_CODE_EMPTY_ERROR("Country code cannot be empty"),
	 * USER_COUNTRY_CODE_INVALID_ERROR("Invalid country code: %s"),
	 */
    USER_DETAILS_EMPTY_ERROR("User details cannot be empty"),
    USER_EMAIL_ADDRESS_INVALID_ERROR("Invalid email: %s"),
    USER_EMAIL_ALREADY_EXISTS_ERROR("Email already exists"),
    USER_EMAIL_EMPTY_ERROR("Email cannot be empty"),
    USER_LOGOUT_SUCCESS("User logged out successfully %s"),
    USER_NAME_EMPTY_ERROR("Name cannot be empty"),
    USER_NOT_FOUND_BY_ACCOUNT("User not found for the given account number: %s"),
    USER_NOT_FOUND_BY_EMAIL("User not found for the given email: %s"),
    USER_NOT_FOUND_BY_IDENTIFIER("User not found for the given identifier: %s"),
    USER_PHONE_NUMBER_ALREADY_EXISTS_ERROR("Phone number already exists"),
    USER_PHONE_NUMBER_EMPTY_ERROR("Phone number cannot be empty"),
    USER_PHONE_NUMBER_INVALID_ERROR("Invalid phone number: %s for country code: %s"),
    USER_REGISTRATION_SUCCESS("User registered successfully"),
    USER_UPDATE_SUCCESS("User updated successfully");

    @Getter
    private final String message;

}
