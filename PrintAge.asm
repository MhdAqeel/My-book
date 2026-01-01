.data
string1: .asciiz "Name: " 
string2: .asciiz "Mohanathas\n"
string3: .asciiz "Address: "
string4: .asciiz "Jaffna\n"
string5: .asciiz "Age: "
age: .word 20   # Integer value for age

.text
.global _start
_start:
    jal main    # Jump to the main function
    li $v0, 10  # Syscall 10 to exit the program
    syscall     # Execute the exit syscall
 
main:
    # Print "Name: "
    la $a0, string1  # Load address of "Name: " into $a0
    li $v0, 4        # Syscall code for printing a string
    syscall          # Perform the syscall

    # Print "Mohanathas"
    la $a0, string2  # Load address of "Mohanathas\n" into $a0
    li $v0, 4        # Syscall code for printing a string
    syscall          # Perform the syscall

    # Print "Address: "
    la $a0, string3  # Load address of "Address: " into $a0
    li $v0, 4        # Syscall code for printing a string
    syscall          # Perform the syscall

    # Print "Jaffna"
    la $a0, string4  # Load address of "Jaffna\n" into $a0
    li $v0, 4        # Syscall code for printing a string
    syscall          # Perform the syscall

    # Print "Age: "
    la $a0, string5  # Load address of "Age: " into $a0
    li $v0, 4        # Syscall code for printing a string
    syscall          # Perform the syscall

    # Print the age (20)
    lw $a0, age      # Load the age value into $a0
    li $v0, 1        # Syscall code for printing an integer
    syscall          # Perform the syscall

    # Print a newline after the age
    li $a0, 0xA      # ASCII value for newline
    li $v0, 11       # Syscall code for printing a character
    syscall          # Perform the syscall

    jr $ra  # Return to the caller (end of main)
