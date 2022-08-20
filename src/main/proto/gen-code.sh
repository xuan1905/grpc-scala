# run this file at source root

cd src/main/proto
export output_folder=../scala/grpc # an empty package you created beforehand

# note to put the .proto file at the end
./protoc.exe  --java_out=$output_folder   --grpc-java_out=$output_folder --plugin=protoc-gen-grpc-java=protoc-grpc-java.exe ./Check.proto

# move generated files as children of package grpc since the previous cmd created a folder inside it (i.e. grpc.grpc)
mv $output_folder/grpc/*.* $output_folder && rm -r ../scala/grpc/grpc