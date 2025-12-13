
echo "--Calculator--"
echo "Enter 1st number:"
read num1
echo "Enter 2nd number:"
read num2


echo "Enter the symbol of the operation to be performed (+, -, *, /, %):"
read op

if [[ "$op" == "+" ]]; then
   
    result=$((num1 + num2))
    echo "The result is $result"

elif [[ "$op" == "-" ]]; then
    
    result=$((num1 - num2))
    echo "The result is $result"

elif [[ "$op" == "*" ]]; then
    
    result=$((num1 * num2))
    echo "The result is $result"

elif [[ "$op" == "/" ]]; then
    
    if [ "$num2" == 0 ]; then
        echo "Error: Cannot divide by zero!"
    else
        
        result=$((num1 / num2))
        echo "The result is $result"
    fi

elif [[ "$op" == "%" ]]; then
    
    if [ "$num2" -eq 0 ]; then
        echo "Error: Cannot perform modulo with zero!"
    else
        
        result=$((num1 % num2))
        echo "The result is $result"
    fi
    
else
    
    echo "Error: Invalid operation symbol entered. Please use +, -, *, /, or %."
fi

